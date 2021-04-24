package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class RevisionFormatter2 implements RevisionInterface {
    @Override
    public String format(Revision revision) {
        String date = DateTimeFormatter.ofPattern("MM-dd-yyyy").withZone(ZoneId.from(ZoneOffset.UTC)).format(revision.timestamp);
        String time = DateTimeFormatter.ofPattern("HH:mm:ss").withZone(ZoneId.from(ZoneOffset.UTC)).format(revision.timestamp);
        return String.format("Changed by %s, at %s on %s", revision.name, date, time);
    }
}
