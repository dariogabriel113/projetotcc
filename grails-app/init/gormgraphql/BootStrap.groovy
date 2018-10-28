package gormgraphql

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j

import java.time.LocalDate

@Slf4j
@CompileStatic
class BootStrap {

    SpeakerDataService speakerDataService

    TalkDataService talkDataService

    def init = { servletContext ->
        log.info "Populating database..."

        for (int i = 0; i < 10; i++) {
            Speaker speaker = speakerDataService.save(i.toString() + ' Graeme', 'Rocher', 'Graeme Rocher', 'rocherg@objectcomputing.com', 'Graeme Rocher is the tech lead for the Grails project', LocalDate.of(1975, 11, 15))

            for (int j = 0; j < 950; j++) {
                talkDataService.save('Testing with Grails 3', j * 10, speaker)
                talkDataService.save('Polyglot Development with Grails 3', j * 9, speaker)
            }
        }

    }

    def destroy = {
    }
}
