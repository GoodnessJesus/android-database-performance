package de.greenrobot.daotest.entity;

import de.greenrobot.dao.test.AbstractDaoTestLongPk;

import de.greenrobot.daotest.SimpleEntityNotNull;
import de.greenrobot.daotest.SimpleEntityNotNullDao;

public class SimpleEntityNotNullTest extends AbstractDaoTestLongPk<SimpleEntityNotNullDao, SimpleEntityNotNull> {

    public SimpleEntityNotNullTest() {
        super(SimpleEntityNotNullDao.class);
    }

    @Override
    protected SimpleEntityNotNull createEntity(Long key) {
        return SimpleEntityNotNullHelper.createEntity(key);
    }

}
