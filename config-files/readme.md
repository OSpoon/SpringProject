
##### **�������÷�ʽ1**
`/{application}-{profile}.yml`
`http://localhost:3000/application-dev.yml`
`http://localhost:3000/application-test.yml`
##### **�������÷�ʽ2**
`/{application}/{profile}[/{lable}]`
`http://localhost:3000/application/dev/master`
`http://localhost:3000/application/test/master`
##### **�������÷�ʽ3**
`/{lable}/{application}-{profile}.yml`
`http://localhost:3000/master/application-dev.yml`
`http://localhost:3000/master/application-test.yml`

ע:
    1. {application}ӳ�䵽�ͻ��˵� spring.application.name
    2. {profile}ӳ�䵽�ͻ����ϵ� spring.profiles.active
    3. {label}����һ���������˹��ܣ���ǡ��汾���������ļ���