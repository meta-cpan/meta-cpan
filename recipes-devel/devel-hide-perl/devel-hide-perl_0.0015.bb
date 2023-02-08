DESCRIPTION = "Given a list of Perl modules/filenames, this module makes "require" and \
"use" statements fail (no matter the specified files/modules are installed \
or not)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Hide"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DC/DCANTRELL/Devel-Hide-0.0015.tar.gz"

SRC_URI[md5sum] = "7f11107163e259754c3f7dc7c2cf6d91"
SRC_URI[sha256sum] = "fc8dbeb7f7d75a78ed496b1e0e05cfc99c68acab3a2e92cff155ca5f0fa5df58"

S = "${WORKDIR}/Devel-Hide-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
