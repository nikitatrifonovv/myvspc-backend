package com.ntsoftware.myvspc.scheduleservice.entities;

public class ScheduleLesson {

    private String name;

    private String type;

    private String teacher;

    private String audience;

    private String start;

    private String end;

    private String _break;

    private ScheduleLesson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String get_break() {
        return _break;
    }

    public void set_break(String _break) {
        this._break = _break;
    }

    @Override
    public String toString() {
        return "ScheduleLesson{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", teacher='" + teacher + '\'' +
                ", audience='" + audience + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", _break='" + _break + '\'' +
                '}';
    }

    public static class Builder {

        ScheduleLesson lesson;

        public static Builder newInstance() {
            return new Builder();
        }

        private Builder() {
            lesson = new ScheduleLesson();
        }

        public Builder withName(String name) {
            lesson.name = name;
            return this;
        }

        public Builder withType(String type) {
            lesson.type = type;
            return this;
        }

        public Builder withTeacher(String teacher) {
            lesson.teacher = teacher;
            return this;
        }

        public Builder withAudience(String audience) {
            lesson.audience = audience;
            return this;
        }

        public Builder withStart(String start) {
            lesson.start = start;
            return this;
        }

        public Builder withEnd(String end) {
            lesson.end = end;
            return this;
        }

        public Builder withBreak(String _break) {
            lesson._break = _break;
            return this;
        }

        public ScheduleLesson build() {
            return lesson;
        }
    }
}
