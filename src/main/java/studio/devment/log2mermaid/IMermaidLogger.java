package studio.devment.log2mermaid;

import org.slf4j.Logger;

public interface IMermaidLogger extends Logger {

    void addParticipant(String participant);

    void addParticipant(String participant, String alias);


    void createParticipant(String participant);

    void createParticipant(String participant, String alias);

    void destroyParticipant(String participant);


    void addActor(String actor);

    void addActor(String actor, String alias);


    void createActor(String actor);

    void createActor(String actor, String alias);

    void destroyActor(String actor);


    void createBox(String groupName, String color, String... participants);
    //TODO add actors



    void logRequest(String sender, String receiver, String msg);

    void logRequest(String sender, String receiver, String msg, MessageType type);
    //TODO add activation & deactivation


    void logResponse(String receiver, String sender, String msg);

    void logResponse(String receiver, String sender, String msg, MessageType type);


    void logNote(String note, String rightOf);

    void logNote(String note, String overFirst, String overSecond);

    //TODO add Loops
    //TODO add Alt
    //TODO add Parallel
    //TODO add CriticalRegion
    //TODO add break
    //TODO add background highlighting
    //TODO add sequence Number
}
