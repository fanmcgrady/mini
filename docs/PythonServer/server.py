from random import random

import uvicorn
from fastapi import FastAPI

from bean.user import User

app = FastAPI()

@app.get('/calc/a={a}&b={b}')
def calculate_servlet(a: int, b: int):
    c = a + b
    result = {"result": c}
    return result

@app.get('/user/name={name}')
def get_user_info(name: str):
    user = None

    if name == 'zhangsan':
        user = User("zhangsan", "123")

    return user

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
    uvicorn.run(app=app, port=8889)