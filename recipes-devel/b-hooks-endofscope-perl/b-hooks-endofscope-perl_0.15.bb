DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/B-Hooks-EndOfScope"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/B-Hooks-EndOfScope-0.15.tar.gz"

SRC_URI[md5sum] = "61dd64e3a05ffb06fee9bee3211d16b8"
SRC_URI[sha256sum] = "122ee422d3d49d994fa6e1e57c8800acfe6aeae56ce430a06eabc37300c1942e"
RDEPENDS_${PN} += "module-implementation-perl"
RDEPENDS_${PN} += "sub-exporter-progressive-perl"

S = "${WORKDIR}/B-Hooks-EndOfScope-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
