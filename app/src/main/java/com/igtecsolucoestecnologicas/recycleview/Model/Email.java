package com.igtecsolucoestecnologicas.recycleview.Model;

public class Email {
    private String user;
    private String subject;
    private String preview;
    private String date;
    private boolean stared;
    private boolean unread;
    private boolean selected;

    public Email() {
    }

    public Email(String user, String subject, String preview, String date, boolean stared, boolean unread, boolean selected) {
        this.user = user;
        this.subject = subject;
        this.preview = preview;
        this.date = date;
        this.stared = stared;
        this.unread = unread;
        this.selected = selected;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isStared() {
        return stared;
    }

    public void setStared(boolean stared) {
        this.stared = stared;
    }

    public boolean isUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public static class EmailBuilder{

        private String user;
        private String subject;
        private String preview;
        private String date;
        private boolean stared;
        private boolean unread;
        private boolean selected;

        public EmailBuilder setUser(String user) {
            this.user = user;
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;

        }

        public EmailBuilder setPreview(String preview) {
            this.preview = preview;
            return this;

        }

        public EmailBuilder setDate(String date) {
            this.date = date;
            return this;

        }

        public EmailBuilder setStared(boolean stared) {
            this.stared = stared;
            return this;

        }

        public EmailBuilder setUnread(boolean unread) {
            this.unread = unread;
            return this;

        }

        public EmailBuilder setSelected(boolean selected) {
            this.selected = selected;
            return this;

        }

        private EmailBuilder(){}

        public static EmailBuilder builder(){
            return new EmailBuilder();
        }

        public Email build(){
            Email email = new Email();

            email.user = user;
            email.subject = subject;
            email.preview = preview;
            email.date = date;
            email.stared = stared;
            email.unread = unread;
            email.selected = selected;

            return email;
        }
    }
}
