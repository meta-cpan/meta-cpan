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
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dancer2-Plugin-Auth-YARBAC"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AV/AVERNA/Dancer2-Plugin-Auth-YARBAC-0.009.tar.gz"

SRC_URI[md5sum] = "167879585d73e7975648c7ed6f49b0f0"
SRC_URI[sha256sum] = "c975b34c36e8a22608ddf98ca327a0a39e98fb343ae44259baf7e9e2577695d8"
RDEPENDS_${PN} += "crypt-pbkdf2-perl"
RDEPENDS_${PN} += "dancer2-perl"
RDEPENDS_${PN} += "dancer2-plugin-database-perl"
RDEPENDS_${PN} += "moo-perl"
RDEPENDS_${PN} += "namespace-clean-perl"
RDEPENDS_${PN} += "try-tiny-perl"
DEPENDS += "dancer2-session-cookie-perl-native"
DEPENDS += "find-lib-perl-native"
DEPENDS += "http-message-perl-native"
DEPENDS += "plack-perl-native"
DEPENDS += "template-toolkit-perl-native"

S = "${WORKDIR}/Dancer2-Plugin-Auth-YARBAC-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
