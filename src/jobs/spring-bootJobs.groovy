String basePath = 'spring-boot'
String repo = 'avpatel257/spring-boot'

job("$basePath" + "-build") {
    scm {
        github repo
    }
    triggers {
        scm 'H/5 * * * *'
    }
    steps {
        maven('clean package')
    }
}
