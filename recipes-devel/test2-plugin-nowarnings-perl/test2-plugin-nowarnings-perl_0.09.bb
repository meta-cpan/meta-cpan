DESCRIPTION = "Loading this plugin causes your tests to fail if there any warnings while \
they run. Each warning generates a new failing test and the warning content \
is outputted via "diag"."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test2-Plugin-NoWarnings"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Test2-Plugin-NoWarnings-0.09.tar.gz"

SRC_URI[md5sum] = "efcddec6cda66260ae14206e28f7feeb"
SRC_URI[sha256sum] = "be3dd800042eef362bf17d2056cf9e934dee91ccce98e4f178b8fb5772f2fb74"
DEPENDS += "ipc-run3-perl-native"
DEPENDS += "test2-suite-perl-native"

S = "${WORKDIR}/Test2-Plugin-NoWarnings-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
