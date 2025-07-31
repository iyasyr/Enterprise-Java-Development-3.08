# Association & Event Management Models

This project models two independent domains using Spring JPA and Lombok:

1. **Nurses Association**
   - **Entities**: `Chapter`, `Member`, `MemberStatus`.
   - **Relationships**:
     - A `Chapter` has one `president` (`Member`) and many `members` (`List<Member>`).
     - A `Member` belongs to one `Chapter`.
   - **Cascading**: `cascade = ALL` and `orphanRemoval = true` on `Chapter.members` ensures the chapter owns its members’ lifecycle.

2. **Event Management**
   - **Entities**: `Event` (abstract), `Conference`, `Exposition`, `Guest`, `GuestStatus`, `Speaker`.
   - **Inheritance**: Uses **Joined Table Inheritance** (`@Inheritance(strategy = InheritanceType.JOINED)`) on `Event`:
     - Base `events` table holds common fields (`id`, `date`, `duration`, `location`, `title`).
     - Subclass tables (`conferences`, `expositions`) extend `events` via PK = FK.
   - **Relationships**:
     - `Event` has many `Guest` (`List<Guest>`).
     - `Conference` has many `Speaker` (`List<Speaker>`).
