package is.toxic.db.identity.repository;

import is.toxic.db.identity.dto.TelegramState;
import is.toxic.db.identity.tables.TelegramStates;
import is.toxic.repository.CrudRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class TelegramStateRepository  implements CrudRepository<Long, TelegramState> {

    private final DSLContext dsl;

    @Override
    public TelegramState insert(TelegramState telegramState) {
        return dsl.insertInto(TelegramStates.TELEGRAM_STATES)
                .set(dsl.newRecord(TelegramStates.TELEGRAM_STATES, telegramState))
                .returning()
                .fetchOne()
                .into(TelegramState.class);
    }

    @Override
    public TelegramState update(TelegramState telegramState) {
        return dsl.update(TelegramStates.TELEGRAM_STATES)
                .set(dsl.newRecord(TelegramStates.TELEGRAM_STATES, telegramState))
                .where(TelegramStates.TELEGRAM_STATES.ID.eq(telegramState.getId()))
                .returning()
                .fetchOne()
                .into(TelegramState.class);
    }

    @Override
    public TelegramState find(Long id) {
        return dsl.selectFrom(TelegramStates.TELEGRAM_STATES)
                .where(TelegramStates.TELEGRAM_STATES.ID.eq(id))
                .fetchAny()
                .into(TelegramState.class);
    }

    @Override
    public List<TelegramState> findAll(Condition condition) {
        return dsl.selectFrom(TelegramStates.TELEGRAM_STATES)
                .where(condition)
                .fetch()
                .into(TelegramState.class);
    }

    @Override
    public Boolean delete(Long id) {
        return dsl.deleteFrom(TelegramStates.TELEGRAM_STATES)
                .where(TelegramStates.TELEGRAM_STATES.ID.eq(id))
                .execute() == SUCCESS_CODE;
    }
}
