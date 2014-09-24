DESCRIPTION = "This role provides universal logging via Log::Any. The \
class using this role doesn't need to know or care about the details \
of log configuration, implementation or destination."

SECTION = "libs"
LICENSE = "Apache-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MooX-Role-Logger"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/MooX-Role-Logger-0.004.tar.gz"

SRC_URI[md5sum] = "033bff45d3e8bb1e6f2214c784aa45fb"
SRC_URI[sha256sum] = "f4d8ec8898fd796ad85e2adc733711d3e8e9477d467b8e4d05b6b2097be454e9"
RDEPENDS_${PN} += "log-any-perl"
RDEPENDS_${PN} += "moo-perl"
RECOMMENDS += "perl"

S = "${WORKDIR}/MooX-Role-Logger-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
