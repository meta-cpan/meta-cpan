DESCRIPTION = "When enabled, this pragma warns about indirect method calls that are \
present in your code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/indirect"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/V/VP/VPIT/indirect-0.39.tar.gz"

SRC_URI[md5sum] = "3509a7e745959e683318c5db1bb02ef4"
SRC_URI[sha256sum] = "71733c4c348e98fdd575b44a52042428c39888a18c25656efe59ef3d7d0d27e5"

S = "${WORKDIR}/indirect-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
