DESCRIPTION = "The \"mro\" namespace provides several utilities for dealing with \
method resolution order and method caching in general in Perl 5.9.5 and \
higher."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MRO-Compat"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/B/BO/BOBTFISH/MRO-Compat-0.12.tar.gz"

SRC_URI[md5sum] = "06d21a3baf3d578ff3d3e10621656530"
SRC_URI[sha256sum] = "bba5b93869aa537a3389949669d682f047d3014d53bc3a2d7209c6819e5015d6"
DEPENDS += "extutils-makemaker-perl-native"

S = "${WORKDIR}/MRO-Compat-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
