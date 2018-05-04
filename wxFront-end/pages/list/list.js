// pages/list/list.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    list:[]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    
  },

  /**
   * 生命周期函数--监听页面显示
   * 与加载的区别，若是返回页面，则不需要加载，而是调用Show方法
   */
  onShow: function () {
    //这里的this是指窗口而在request中this是指onShow方法(因为是页面调用onShow,onShow调用request)，所以要先定义
    var that = this;
    wx.request({
      //后端接口提供的url
      url: 'http://localhost:8080/area/areaList',
      method:'GET',
      //需要传入的参数
      data:{},
      //如果访问成功
      success:function(res){
        var list = res.data.data;
        if(list == null){
          //如果获取数据失败，提示使用者
          var toastText = '获取数据失败' + res.data.msg;
          wx.showToast({
            title: toastText,
            icon:'',
            //显示时长为2s
            duration:2000
          })
        }else{
          that.setData({
            list:list
          })
        }
      }
    })
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

  addArea: function(){
    wx.navigateTo({
      url: '../operation/operation',
    })
  },

  //e表示响应的控件
  delArea: function(e){
    var that = this;
    //相当于confirm窗口
    wx.showModal({
      title: '提示',
      //这里的变量名需要与响应控件的data-后面的变量名相同
      content: '确认要删除['+e.target.dataset.name+']吗？',
      success:function(sm){
        if(sm.confirm){
          wx.request({
            url: 'http://localhost:8080/area/delete',
            data: {'id':e.target.dataset.id},
            header: {
              //默认是 'content-type': 'application/json'，要传post的参数必须写成这样，要传delete参数则为null
              "content-type": "application/x-www-form-urlencoded"
            },
            method: 'POST',
            success: function(res) {
              var result = res.data.success;
              var toastText='删除成功';
              if(result == true){
                that.data.list.splice(e.target.dataset.index,1);
                that.setData({
                  list:that.data.list
                });
              }else{
                toastText = '删除失败';
              }
              wx.showToast({
                title: toastText,
                duration:2000
              })
            },
          })
        }
      }
    })
  }
})