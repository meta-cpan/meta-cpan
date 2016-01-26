DESCRIPTION = "Devel::OverloadInfo returns information about overloaded operators for \
a given class (or object), including where in the inheritance hierarchy \
the \
overloads are declared and where the code implementing it is."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-OverloadInfo"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IL/ILMARI/Devel-OverloadInfo-0.004.tar.gz"

SRC_URI[md5sum] = "97a27e31858b073daba54121d57be705"
SRC_URI[sha256sum] = "83e88450064b0b0bbfd520cc9d7997fc7bed14ae257894eeadda28dc3e94937d"
RDEPENDS_${PN} += "mro-compat-perl"
RDEPENDS_${PN} += "package-stash-perl"
RDEPENDS_${PN} += "sub-identify-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Devel-OverloadInfo-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
