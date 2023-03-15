DESCRIPTION = "Class::Inspector allows you to get information about a loaded class. Most \
or all of this information can be found in other ways, but they aren't \
always very friendly, and usually involve a relatively high level of Perl \
wizardry, or strange and unusual looking code. Class::Inspector attempts to \
provide an easier, more friendly interface to this information."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Inspector"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/Class-Inspector-1.36.tar.gz"

SRC_URI[md5sum] = "084c3aeec023639d21ecbaf7d4460b21"
SRC_URI[sha256sum] = "cc295d23a472687c24489d58226ead23b9fdc2588e522f0b5f0747741700694e"

S = "${WORKDIR}/Class-Inspector-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
