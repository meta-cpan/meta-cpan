DESCRIPTION = "DateTime::Locale is primarily a factory for the various locale subclasses. \
It also provides some functions for getting information on all the \
available locales."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/DateTime-Locale"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/DateTime-Locale-1.02.tar.gz"

SRC_URI[md5sum] = "166c89a52f868f7a7f48b2ec5ff2a534"
SRC_URI[sha256sum] = "63ad62bcc01c7007d233f6270c05059a6cdc4270812546450759d03d8cfcf355"
RDEPENDS_${PN} += "list-moreutils-perl"
RDEPENDS_${PN} += "params-validate-perl"
DEPENDS += "dist-checkconflicts-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-requires-perl-native"
DEPENDS += "test-warnings-perl-native"

S = "${WORKDIR}/DateTime-Locale-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
