package Project_1.BookApp.Record;

import java.util.List;

public record BookSearchResponse(int numFound, List<BookStatusRecord> docs) {
}
