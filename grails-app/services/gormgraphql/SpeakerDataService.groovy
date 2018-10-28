package gormgraphql

import grails.gorm.services.Service
import groovy.transform.CompileStatic
import java.time.LocalDate

@CompileStatic
@Service(Speaker)
interface SpeakerDataService {
    Speaker save(String nome,
                 String sobrenome,
                 String nomeCompleto,
                 String email,
                 String bio,
                 LocalDate birthday)
}