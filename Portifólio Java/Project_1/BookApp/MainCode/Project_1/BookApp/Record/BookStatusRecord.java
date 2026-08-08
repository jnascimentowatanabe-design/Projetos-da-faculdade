package Project_1.BookApp.Record;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public record BookStatusRecord(String title, List<String> authorName, int firstPublishYear) {
}
