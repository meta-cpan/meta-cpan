DESCRIPTION = "This is an XS backend for Devel::GlobalDestruction and should be used \
through that module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-GlobalDestruction-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Devel-GlobalDestruction-XS-0.03.tar.gz"

SRC_URI[md5sum] = "7edd0f6995af618071f84818ddb900c7"
SRC_URI[sha256sum] = "59af05cb256f7ec297ad6bfa8ebee2f292f01b518926de3204e2341ed2dbfc91"

S = "${WORKDIR}/Devel-GlobalDestruction-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
