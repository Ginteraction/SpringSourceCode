# java-springboot
踩坑记：
1.springboot运行后，不管怎么改都是上一次的运行结果
答案：
因为一直以来新的更改都没有编译成功，是运行的上次编译成功的classes文件
还有就是注意outputfile就是class文件的目录，如果目录不对，项目很可能就是配置有错的