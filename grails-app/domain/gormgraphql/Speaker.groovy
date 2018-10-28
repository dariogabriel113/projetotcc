package gormgraphql

import grails.rest.Resource
import org.grails.gorm.graphql.entity.dsl.GraphQLMapping
import java.time.LocalDate
import java.time.Period

@Resource(uri = '/speaker')
class Speaker {

    String nome
    String sobrenome
    String nomeCompleto
    String email
    String bio
    LocalDate birthday

    static hasMany = [talks: Talk]

    static graphql = GraphQLMapping.build {

        property 'nome', order: 1
        property 'sobrenome', order: 2
        property 'nomeCompleto', order: 3
        property 'email', order: 4
        property 'bio', order: 5
        property 'birthday', order: 6
    }

    static constraints = {
        email nullable: true, email: true
        bio nullable: true
    }

    static mapping = {
        nome type: 'text'
        sobrenome type: 'text'
        nomeCompleto type: 'text'
        email type: 'text'
        bio type: 'text'
        talks sort: 'id'
    }

}