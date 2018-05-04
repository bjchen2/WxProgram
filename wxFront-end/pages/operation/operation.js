// pages/opration/opration.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    id:undefined,
    areaName:'',
    priority:'',
    addUrl:'http://localhost:8080/area',
    updateUrl:'http://localhost:8080/area/areaInfo'
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    //options为页面跳转带来的参数
    var that = this;
    if(options.id != undefined){
      //若是由编辑按钮跳转过来的
      that.setData({
        id:options.id
      });
      wx.request({
        url: 'http://localhost:8080/area/one',
        data: {'id':options.id},
        method: 'GET',
        success: function(res) {
          var result = res.data.success;
          if(result){
            that.setData({
              areaName:res.data.data.name,
              priority: res.data.data.priority
            });
          }else{
            wx.showToast({
              title: '请求失败'+res.data.msg,
              duration: 2000,
            });
          }
        },
      })
    }
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  },

  formSubmit:function(e){
    var that = this;
    //获取表单值
    var formData = e.detail.value;
    var url = this.data.addUrl;
    if(this.data.id != undefined){
      //如果是编辑按钮跳转
        formData.id = this.data.id; 
        url = this.data.updateUrl;
    }
    console.log(JSON.stringify(formData));
    wx.request({
      url: url,
      //将其转换成JSON
      data: JSON.stringify(formData),
      method: 'POST',
      success: function(res) {
        var result = res.data.success;
        var toastText = '请求成功';
        if(!result){
          toastText = '请求失败'+res.data.msg;
        }
        wx.showToast({
          title: toastText,
          duration: 2000,
        })
        if(result){
          wx.redirectTo({
            //操作结束后跳转回列表页
            url: '../list/list',
          })
        }
      },
    })
  }
})