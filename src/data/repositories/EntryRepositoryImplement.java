package data.repositories;

import data.models.Entry;

public class EntryRepositoryImplement implements EntryRepository{
    private List<Entry> entries = new ArrayList();
    @Override
    public Entry save(Entry entry) {
        for(Entry entry1: entries){
            if(entry1.getEntryTitle.equals(entry.getEntryTitle)){
                enteries.add(entry);
                return entry;
            }
        }
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
