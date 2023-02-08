DESCRIPTION = "YARBAC is a role based user authentication and authorisation framework \
for Dancer2 apps. Designed with security and a medium to large user \
base in \
mind. This framework was heavily inspired by the excellent \
Dancer::Plugin::Auth::Extensible framework which I'd highly recommend. \
YARBAC was designed to support secure password checking, enforced \
password \
hashing, multiple authentication realms and the ability to create your \
own \
backend provider. YARBAC was also designed to to be as flexible and as \
feature rich as possible in the hope that I'll never have to write RBAC \
code \
for Dancer again. :) While similar to Extensible in some ways, this \
framework has some significantly different approaches. These \
differences \
were born out of my own experiences writing RBAC code for various \
Dancer \
apps and finding myself always having to extend existing modules or \
starting \
from scratch or worse still, copy/paste my old code then reworking it. \
The \
major difference with YARBAC is that it tries to be a complete solution \
to \
the problem. However in order to be a little more flexible and feature \
rich \
in some areas it is also a little more opinionated in others. The main \
area \
of opinion in YARBAC is how it achieves role-based access control. \
YARBAC is \
structed with users, roles, groups and permissions. A user can have \
many \
roles but it might be a good idea in larger enviornments to only allow \
a \
user to have one role and then assign that role have many groups. Think \
of a \
role as being a role-group. Then there are groups which have many \
permissions. A user can have one or more roles, a role can have one or \
more \
groups and groups can have one or more permissions. This means when \
deciding \
if a user is authorised we could require they be logged in, or have a \
specifc role, or specific group, or a specific group with a specific \
permission and so on. To put it another way, this design moves the \
access \
control down to the role-group relationship thus allowing one to \
quickly and \
easily see, assign or revoke permissions to a user even when dealing \
with a \
fairly complex authorisation environment."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2-Plugin-Auth-YARBAC"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AV/AVERNA/Dancer2-Plugin-Auth-YARBAC-0.011.tar.gz"

SRC_URI[md5sum] = "faf754be3af82510fed6a83826568714"
SRC_URI[sha256sum] = "d67038684629d9103dc442cbc134722e1ac0662302f7f599620a46c6c329d57b"
RDEPENDS:${PN} += "crypt-pbkdf2-perl"
RDEPENDS:${PN} += "dancer2-perl"
RDEPENDS:${PN} += "dancer2-plugin-database-perl"
RDEPENDS:${PN} += "moo-perl"
RDEPENDS:${PN} += "namespace-clean-perl"
RDEPENDS:${PN} += "try-tiny-perl"
DEPENDS += "dbd-sqlite-perl-native"
DEPENDS += "dancer2-session-cookie-perl-native"
DEPENDS += "find-lib-perl-native"
DEPENDS += "http-message-perl-native"
DEPENDS += "plack-perl-native"
DEPENDS += "template-toolkit-perl-native"

S = "${WORKDIR}/Dancer2-Plugin-Auth-YARBAC-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
