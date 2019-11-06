
##### **访问配置方式1**
`/{application}-{profile}.yml`
`http://localhost:3000/application-dev.yml`
`http://localhost:3000/application-test.yml`
##### **访问配置方式2**
`/{application}/{profile}[/{lable}]`
`http://localhost:3000/application/dev/master`
`http://localhost:3000/application/test/master`
##### **访问配置方式3**
`/{lable}/{application}-{profile}.yml`
`http://localhost:3000/master/application-dev.yml`
`http://localhost:3000/master/application-test.yml`

注:
    1. {application}映射到客户端的 spring.application.name
    2. {profile}映射到客户端上的 spring.profiles.active
    3. {label}这是一个服务器端功能，标记”版本”的配置文件集