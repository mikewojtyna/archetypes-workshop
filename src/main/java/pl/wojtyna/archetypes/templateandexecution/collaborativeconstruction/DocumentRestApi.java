package pl.wojtyna.archetypes.templateandexecution.collaborativeconstruction;

import org.springframework.web.bind.annotation.*;
import pl.wojtyna.archetypes.common.DomainEventPublisher;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentRestApi {

    private DomainEventPublisher domainEventPublisher;

    @PostMapping
    public void createDocument(Document document) {

    }

    @PutMapping
    public void updateDocument(Document document) {

    }

    @DeleteMapping
    public void deleteDocument(String id) {

    }

    @GetMapping
    public Document getDocument(String id) {
        return null;
    }

    @PostMapping("/{id}/publish")
    public void publish(String id) {
        domainEventPublisher.publish(new DraftCreated(draftOf(id)));
    }

    private Draft draftOf(String id) {
        return null;
    }
}
