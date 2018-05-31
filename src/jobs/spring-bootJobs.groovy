String basePath = 'spring-boot'
String repo = 'avpatel257/spring-boot'

folder(basePath) {
    description 'This example shows basic folder/job creation.'
}

job("$basePath/-build") {
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