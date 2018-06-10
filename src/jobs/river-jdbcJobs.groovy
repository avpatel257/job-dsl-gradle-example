String basePath = 'elasticsearch-river-jdbc'
String repo = 'avpatel257/elasticsearch-river-jdbc'

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
