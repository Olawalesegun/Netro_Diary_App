package data.repositories;

import data.models.Entry;

public class EntryRepositoryImplement implements EntryRepository{
    @Override
    public Entry save(Entry entry) {
        return null;
    }

    @Override
    public Entry findBy(String entryTitle) {
        return null;
    }

    @Override
    public Entry findBy(int entryID) {
        return null;
    }

    @Override
    public void deleteBy(int entryID) {

    }

    @Override
    public void deleteBy(Entry entry) {

    }

    @Override
    public long count() {
        return 0;
    }
}
