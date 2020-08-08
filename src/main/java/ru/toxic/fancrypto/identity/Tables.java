/*
 * This file is generated by jOOQ.
 */
package ru.toxic.fancrypto.identity;


import ru.toxic.fancrypto.identity.tables.AspNetRoleClaims;
import ru.toxic.fancrypto.identity.tables.AspNetRoles;
import ru.toxic.fancrypto.identity.tables.AspNetUserClaims;
import ru.toxic.fancrypto.identity.tables.AspNetUserLogins;
import ru.toxic.fancrypto.identity.tables.AspNetUserRoles;
import ru.toxic.fancrypto.identity.tables.AspNetUserTokens;
import ru.toxic.fancrypto.identity.tables.AspNetUsers;
import ru.toxic.fancrypto.identity.tables.PersistedGrants;
import ru.toxic.fancrypto.identity.tables.SignIns;
import ru.toxic.fancrypto.identity.tables.TelegramStates;
import ru.toxic.fancrypto.identity.tables.__Efmigrationshistory;


/**
 * Convenience access to all tables in public
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.__EFMigrationsHistory</code>.
     */
    public static final __Efmigrationshistory __EFMIGRATIONSHISTORY = __Efmigrationshistory.__EFMIGRATIONSHISTORY;

    /**
     * The table <code>public.asp_net_role_claims</code>.
     */
    public static final AspNetRoleClaims ASP_NET_ROLE_CLAIMS = AspNetRoleClaims.ASP_NET_ROLE_CLAIMS;

    /**
     * The table <code>public.asp_net_roles</code>.
     */
    public static final AspNetRoles ASP_NET_ROLES = AspNetRoles.ASP_NET_ROLES;

    /**
     * The table <code>public.asp_net_user_claims</code>.
     */
    public static final AspNetUserClaims ASP_NET_USER_CLAIMS = AspNetUserClaims.ASP_NET_USER_CLAIMS;

    /**
     * The table <code>public.asp_net_user_logins</code>.
     */
    public static final AspNetUserLogins ASP_NET_USER_LOGINS = AspNetUserLogins.ASP_NET_USER_LOGINS;

    /**
     * The table <code>public.asp_net_user_roles</code>.
     */
    public static final AspNetUserRoles ASP_NET_USER_ROLES = AspNetUserRoles.ASP_NET_USER_ROLES;

    /**
     * The table <code>public.asp_net_user_tokens</code>.
     */
    public static final AspNetUserTokens ASP_NET_USER_TOKENS = AspNetUserTokens.ASP_NET_USER_TOKENS;

    /**
     * The table <code>public.asp_net_users</code>.
     */
    public static final AspNetUsers ASP_NET_USERS = AspNetUsers.ASP_NET_USERS;

    /**
     * The table <code>public.persisted_grants</code>.
     */
    public static final PersistedGrants PERSISTED_GRANTS = PersistedGrants.PERSISTED_GRANTS;

    /**
     * The table <code>public.sign_ins</code>.
     */
    public static final SignIns SIGN_INS = SignIns.SIGN_INS;

    /**
     * The table <code>public.telegram_states</code>.
     */
    public static final TelegramStates TELEGRAM_STATES = TelegramStates.TELEGRAM_STATES;
}