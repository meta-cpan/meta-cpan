DESCRIPTION = "Loading this plugin causes your tests to fail if there any warnings while \
they run. Each warning generates a new failing test and the warning content \
is outputted via "diag"."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test2-Plugin-NoWarnings"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Test2-Plugin-NoWarnings-0.06.tar.gz"

SRC_URI[md5sum] = "c329dcd57b3d5990e134508fc02d76d2"
SRC_URI[sha256sum] = "8288c1d934f69a03224598fbb715adc079c0d1609bfbaea6c88682aab1995800"
DEPENDS += "ipc-run3-perl-native"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/Test2-Plugin-NoWarnings-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
