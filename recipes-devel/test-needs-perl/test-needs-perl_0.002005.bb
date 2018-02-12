DESCRIPTION = "Skip test scripts if modules are not available. The requested modules will \
be loaded, and optionally have their versions checked. If the module is \
missing, the test script will be skipped. Modules that are found but fail \
to compile will exit with an error rather than skip."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Needs"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Test-Needs-0.002005.tar.gz"

SRC_URI[md5sum] = "356634a56c99282e8059f290f5d534c8"
SRC_URI[sha256sum] = "5a4f33983586edacdbe00a3b429a9834190140190dab28d0f873c394eb7df399"

S = "${WORKDIR}/Test-Needs-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
