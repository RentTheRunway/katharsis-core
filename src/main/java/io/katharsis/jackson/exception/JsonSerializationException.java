package io.katharsis.jackson.exception;

import io.katharsis.errorhandling.ErrorData;
import io.katharsis.errorhandling.exception.KatharsisException;
import io.katharsis.response.HttpStatus;

/**
 * Thrown when a Jackson serialization related exception occurs.
 */
public class JsonSerializationException extends KatharsisException {
    public static final String TITLE = "JSON serialization error";

    public JsonSerializationException(String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR_500, ErrorData.builder()
                .setTitle(TITLE)
                .setDetail(message)
                .setStatus(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR_500))
                .build());
    }
}
