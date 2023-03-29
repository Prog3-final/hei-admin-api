create table if not exists "delay_penalty"
(
    id                varchar
        constraint delay_penalty_pk primary key default uuid_generate_v4(),
    interest_percent  integer,
    interest_timerate         varchar,
    grace_delay       integer,
    applicability_delay_after_grace    integer,
    creation_datetime       timestamp with time zone not null default now()
);