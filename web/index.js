function getRemoteData() {
    var id = $("#id").val();
    var url = "http://localhost:8888/hello?id=" + id;
    // 请求远程数据
    $.ajax({
        url: url,
        type: 'GET',
        success: function (result) {
            console.log(result);
            // 显示在页面上
            var data = JSON.stringify(result);
            $("#text2").text("姓名是：" + data);
        },
        error: function (result) {
            var data = JSON.stringify(result);
            console.log("error" + data);
        }
    })
}


function changeText() {
    var textDiv = document.getElementById("text")
    // textDiv.innerText = "<h1>Hello SCU!</h1>";
    textDiv.innerHTML = "<h1>Hello SCU!</h1>";
    textDiv.style.color = "blue";
}

function show() {
    var input = document.getElementById("input-test");
    var textDiv = document.getElementById("text")
    textDiv.innerText = input.value;
}

function appendImg() {
    var img = document.createElement("img");
    img.id = "img";
    img.src = "images/1.jpg";

    var textDiv = document.getElementById("test-span")
    textDiv.appendChild(img);
}

function removeImg() {
    var textDiv = document.getElementById("test-span")
    var img = document.getElementById("img")
    textDiv.removeChild(img)
}

function addTR() {
    var table = document.getElementById("test-table");

    var tr = document.createElement("tr");
    var td1 = document.createElement("td");
    td1.innerText = "5";
    var td2 = document.createElement("td");
    td2.innerText = "6";
    tr.appendChild(td1);
    tr.appendChild(td2);

    table.appendChild(tr);
}