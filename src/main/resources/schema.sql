DROP TABLE IF EXISTS file_metadata;

CREATE TABLE IF NOT EXISTS file_metadata (
    id UUID PRIMARY KEY,
    file_name UUID,
    visible_track_name VARCHAR(255),
    extension VARCHAR(10),
    length INT,
    owner UUID
);
