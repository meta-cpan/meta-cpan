DESCRIPTION = "File::Find::Rule is a friendlier interface to File::Find. It allows you \
to build rules which specify the desired files and directories."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/File-Find-Rule"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RC/RCLAMP/File-Find-Rule-0.33.tar.gz"

SRC_URI[md5sum] = "92c6cb88549c30f5665e39bf80f3d704"
SRC_URI[sha256sum] = "2417752b1eb61774938a67d6f211fbb80eecb3146bf0a0c8699939912559e370"
RDEPENDS_${PN} += "number-compare-perl"
RDEPENDS_${PN} += "text-glob-perl"

S = "${WORKDIR}/File-Find-Rule-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
