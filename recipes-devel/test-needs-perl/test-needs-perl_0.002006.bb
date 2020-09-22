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

SRC_URI = "https://cpan.metacpan.org/authors/id/H/HA/HAARG/Test-Needs-0.002006.tar.gz"

SRC_URI[md5sum] = "d5c96d51d8d5510f7c0b7f354c49af1c"
SRC_URI[sha256sum] = "77f9fff0c96c5e09f34d0416b3533c3319f7cd0bb1f7fe8f8072ad59f433f0e5"

S = "${WORKDIR}/Test-Needs-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
