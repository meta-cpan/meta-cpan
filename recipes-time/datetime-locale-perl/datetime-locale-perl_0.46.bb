DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale \
subclasses. It also provides some functions for getting information on \
all the available locales."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-Locale"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Locale-0.46.tar.gz"

SRC_URI[md5sum] = "f60bf58b2e2e29a49d214985fc17adca"
SRC_URI[sha256sum] = "b4ceaa0dc0b89d4eb180eb970a927cf376e3d04ef42de98de2e034cd2021348d"
RDEPENDS_${PN} += "list-moreutils-perl"
RDEPENDS_${PN} += "params-validate-perl"
DEPENDS += "dist-checkconflicts-perl-native"

S = "${WORKDIR}/DateTime-Locale-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
