// pages/user/user.js
Page({

    /**
     * 页面的初始数据
     */
    data: {
        result: "未请求",
        username: "",
        number: ""
    },

    bindname: function (e) {
        console.log(e.detail.value)
        this.setData({
            username: e.detail.value
        })
    },

    onAdd: function () {
        const db = wx.cloud.database()
        db.collection("student").add({
            data: {
                name: this.data.username,
                number: "111"
            },
            success: res => {
                console.log(res)
                this.setData({
                    result: res._id
                })
            }
        })
    },

    onQuery: function () {
        const db = wx.cloud.database()
        db.collection("student").get(
            {
                success: res => {
                    console.log(res)
                    this.setData({
                        result: JSON.stringify(res.data)
                    })
                }
            }
        )
    },

    onUpdate: function () {
        // const db = wx.cloud.database()
        // db.collection("student").doc("38597c165fadfa1b00b8efba41f161d4").update({
        //   data: {
        //     name: "李四"
        //   },
        //   success: res => {
        //     this.setData({
        //       result: res.data
        //     })
        //   }
        // })
        wx.cloud.callFunction({
            name: 'login',
            data: {},
            success: res => {
                // app.globalData.openid = res.result.openid
                // this.setData({
                //   step: 2,
                //   openid: res.result.openid
                // })
            }
        })
    },

    onDelete: function () {
        const db = wx.cloud.database()
        db.collection("student").doc("38597c165fadfa1b00b8efba41f161d4").remove({
            success: res => {
                this.setData({
                    result: res
                })
            }
        })
    }
})