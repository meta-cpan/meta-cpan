DESCRIPTION = "Test::YAML is a subclass of Test::Base with YAML specific support."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-YAML"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/I/IN/INGY/Test-YAML-1.06.tar.gz"

SRC_URI[md5sum] = "92e6ea57576428095fe3c9b8e00e6f29"
SRC_URI[sha256sum] = "27376103163c12d7d13ae45bf22caf5a0c38478362425bf68613c3748f76b943"
RDEPENDS_${PN} += "test-base-perl"

S = "${WORKDIR}/Test-YAML-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
