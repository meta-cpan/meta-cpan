DESCRIPTION = "This role provides universal logging via Log::Any. The class using this \
role doesn't need to know or care about the details of log configuration, \
implementation or destination."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Role-Logger"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/MooX-Role-Logger-0.005.tar.gz"

SRC_URI[md5sum] = "e3ac3af1d14364ba99341cc437795c70"
SRC_URI[sha256sum] = "d82325bb63f66ac82241f05ea4237ee33206bdd27415cbb6a889be6d5d6d800c"
RDEPENDS_${PN} += "log-any-perl"
RDEPENDS_${PN} += "moo-perl"
DEPENDS += "test-failwarnings-perl-native"

S = "${WORKDIR}/MooX-Role-Logger-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
