DESCRIPTION = "Provides a central location for modules to report monitoring metrics, such \
as counters of the number of times interesting events have happened, and \
programs to collect up and send those metrics to monitoring services."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Metrics-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Metrics-Any-0.06.tar.gz"

SRC_URI[md5sum] = "8e2b45a33c8d5b6c65ce854fce374180"
SRC_URI[sha256sum] = "9c529df8e8a277bb158d6241c73bd1a7ea08aeae9e1edbb5583a1a0748fb9837"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Metrics-Any-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
