// 导入 http 内置模块
const http = require('http')
// 这个核心模块，能够帮我们解析 URL地址，从而拿到  pathname  query
const urlModule = require('url')

// 创建一个 http 服务器
const server = http.createServer()
// 监听 http 服务器的 request 请求
server.on('request', function (req, res) {

    let url = req.url;  //获得URL路径

    if(url.includes("getscript")){
        var sshow="show()";
        res.end(sshow);
    }else {
      res.end("404");
    }



})

// 指定端口号并启动服务器监听
server.listen(3000, function () {
    console.log('server listen at http://127.0.0.1:3000')
})