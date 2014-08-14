DESCRIPTION = "rewrite strings based on a set of known prefixes"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-RewritePrefix"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RJ/RJBS/String-RewritePrefix-0.007.tar.gz"

SRC_URI[md5sum] = "7135a69bd8cf74cf17dba857b2372d16"
SRC_URI[sha256sum] = "5cbbccd5636315a90ddec3610c718411b971ae4b74d5e9e2c9a0b3f976a0dda2"
RDEPENDS_${PN} += "sub-exporter-perl"

S = "${WORKDIR}/String-RewritePrefix-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
