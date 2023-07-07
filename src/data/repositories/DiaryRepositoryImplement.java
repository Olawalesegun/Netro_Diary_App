package data.repositories;

import data.models.Diary;

public class DiaryRepositoryImplement implements DiaryRepository{
    @Override
    public Diary save(Diary diary) {
        return null;
    }

    @Override
    public Diary findBy(String diaryName) {
        return null;
    }
    @Override
    public void delete(String diaryName) {
    }
    @Override
    public void delete(Diary diary) {
    }

    @Override
    public long count() {
        return 0;
    }
}
