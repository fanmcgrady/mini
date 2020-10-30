from random import random

import uvicorn
from fastapi import FastAPI
from starlette.responses import FileResponse
from starlette.staticfiles import StaticFiles

app = FastAPI()
app.mount('/web', StaticFiles(directory="web"))

@app.get('/')
def home():
    return FileResponse("./web/echarts.html")

@app.get('/calc/a={a}&b={b}')
def calculate_servlet(a: int, b: int):
    c = a + b
    result = {"result": c}
    return result

@app.get('/echarts-test')
def get_echarts_data():
    x = ["星期" + str(i) for i in range(1, 8)]

    y = [random() * 100 for _ in range(1, 8)]

    result = {
        "xData" : x,
        "yData" : y
    }
    return result

if __name__ == '__main__':
    uvicorn.run(app=app, port=8888)