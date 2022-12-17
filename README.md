# Spring Boot Admin Example Apps

## Admin Server

currently there ist only one server instance:
- sba-server with port 8080

TODO
- more server examples, but maybe in separate repo?
  - add examples where SBA server has different paths configured
  - add variants with proxy (proxy has path, app does not)

## Monitored Apps: Context Paths

examples of different spring boot apps with and without context path or admin context path being configured

all apps are using self registration via sba client

| number | type    | app has contextpath | actuators have separate contextpath | port | management port |
|--------|---------|---------------------|-------------------------------------|------|-----------------|
| 0      | servlet |                     |                                     | 8100 |                 |
| 1      | servlet |                     | x                                   | 8101 | 9101            |
| 2      | servlet | x                   |                                     | 8200 |                 |
| 3      | servlet | x                   | x                                   | 8201 | 9201            |
| 4      | webflux |                     |                                     | 8300 |                 |
| 5      | webflux |                     | x                                   | 8301 | 9301            |
| 6      | webflux | x                   |                                     | 8400 |                 |
| 7      | webflux | x                   | x                                   | 8401 | 9401            |


TODO
- add variants with proxy (proxy has path, app does not)
- add examples where SBA server has different paths configured
