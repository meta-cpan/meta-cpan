DESCRIPTION = "The \"HTML::HeadParser\" is a specialized (and lightweight) \
\"HTML::Parser\" that will only parse the <HEAD>...</HEAD> section of \
an HTML document. The \
parse() method will return a FALSE value as soon as some <BODY> element \
or \
body text are found, and should not be called again after this."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/HTML-Parser"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTML-Parser-3.71.tar.gz"

SRC_URI[md5sum] = "9128a45893097dfa3bf03301b19c5efe"
SRC_URI[sha256sum] = "be918b3749d3ff93627f72ee4b825683332ecb4c81c67a3a8d72b0435ffbd802"
RDEPENDS_${PN} += "html-tagset-perl"
RRECOMMENDS_${PN} += "http-message-perl"

S = "${WORKDIR}/HTML-Parser-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
